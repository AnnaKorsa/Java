package HW6;

import java.util.*;

public class HW6 {

    public static void main (String[] args) {
        HashSet<Laptop> shop = new HashSet<>();
        catalog(shop);
        HashMap<String, String> filter = new HashMap<>();
        userRequest(filter);

        System.out.println(runFilter(shop,filter));
    }
    public static HashSet<Laptop> catalog(HashSet<Laptop> item) {

        item.add(new Laptop("Sumsung", "14", "Intel", "8", "128", "Windows", "black", "700"));
        item.add(new Laptop("Asus", "14", "Intel", "6", "128", "Windows", "silvery", "600"));
        item.add(new Laptop("DELL", "14", "Intel", "8", "128", "Linux", "white", "1000"));
        item.add(new Laptop("Asus", "15", "Intel", "8", "256", "Windows", "black", "800"));
        item.add(new Laptop("Sumsung", "16", "AMD", "6", "256", "Windows", "black", "700"));
        item.add(new Laptop("Lenovo", "14", "Intel", "8", "128", "Windows", "white", "700"));
        item.add(new Laptop("Acer", "16", "Intel", "16", "512", "Windows", "black", "900"));
        item.add(new Laptop("HP", "17", "Intel", "16", "512", "Windows", "black", "950"));
        item.add(new Laptop("Sony", "14", "Intel", "8", "128", "Windows", "silvery", "700"));
        item.add(new Laptop("DELL", "14", "Intel", "16", "256", "Linux", "white", "1200"));
        item.add(new Laptop("Lenovo", "16", "Intel", "16", "256", "Windows", "black", "900"));
        item.add(new Laptop("Acer", "15", "AMD", "6", "128", "Windows", "silvery", "650"));
        return item;
    }


public static HashMap<String, String> userRequest(HashMap<String, String> filter) {
    Scanner isScanner = new Scanner(System.in);
    int choice;
    do {
        System.out.println("Меню ");
        System.out.println("1. Выберите производителя");
        System.out.println("2. Выберите размер экрана");
        System.out.println("3. Выберите процессор");
        System.out.println("4. Выберите объем оперативной памяти");
        System.out.println("5. Выберите объем жесткого диска");
        System.out.println("6. Выберите операционную систему");
        System.out.println("7. Выберите цвет ноутбука");
        System.out.println("8. Выберите подходящую стоимость");
        System.out.println("Для выхода нажмите 0");
        System.out.println();
        System.out.printf("Введите цифру, соответствующую необходимому критерию: ");
        choice = isScanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Введите название производителя, иначе нажмите Enter для перехода к следующему пункту");
                String brand = new Scanner(System.in).nextLine();
                filter.put("brand", brand);
                break;
            case 2:
                System.out.println("Введите размер экрана, иначе нажмите Enter для перехода к следующему пункту");
                String display = new Scanner(System.in).nextLine();
                filter.put("display", display);
                break;
            case 3:
                System.out.println("Введите процесор, иначе нажмите Enter для перехода к следующему пункту");
                String CPU = new Scanner(System.in).nextLine();
                filter.put("CPU", CPU);
                break;
            case 4:
                System.out.println("Введите объем оперативной памяти, либо нажмите Enter для перехода к следующему пункту");
                String RAM = new Scanner(System.in).nextLine();
                filter.put("RAM", RAM);
                break;

            case 5:
                System.out.println("Введите объем жесткого диска, либо нажмите Enter для перехода к следующему пункту");
                String disk = new Scanner(System.in).nextLine();
                filter.put("disk", disk);
                break;

            case 6:
                System.out.println("Введите операционную систему, либо нажмите Enter для перехода к следующему пункту");
                String OS = new Scanner(System.in).nextLine();
                filter.put("OS", OS);
                break;
            case 7:
                System.out.println("Введите цвет ноутбука, либо нажмите Enter для перехода к следующему пункту");
                String color = new Scanner(System.in).nextLine();
                filter.put("color", color);
                break;
            case 8:
                System.out.println("Введите подходящую стоимость, либо нажмите Enter ");
                String price = new Scanner(System.in).nextLine();
                filter.put("price", price);
                break;

        }
    } while (choice > 0);
    return filter;
}

    public static List<Laptop> runFilter(HashSet<Laptop> item, HashMap<String, String> filter) {
        List<Laptop> itemSelect = new ArrayList<>();

        for (Laptop lp : item) {
            String filterBrand = filter.get("brand");
            if (filterBrand != null
                    && !filterBrand.equals(lp.getBrand())) {
                continue;
            }
            String filterDisplay = filter.get("display");
            if (filterDisplay != null
                    && !filterDisplay.equals(lp.getDisplay())) {
                continue;
            }

            String filterCPU = filter.get("CPU");
            if (filterCPU != null
                    && !filterCPU.equals(lp.getCPU())) {
                continue;
            }

            String filterRAM = filter.get("RAM");
            if (filterRAM != null
                    && !filterRAM.equals(lp.getRAM())) {
                continue;
            }

            String filterDisk = filter.get("disk");
            if (filterDisk != null
                    && !filterDisk.equals(lp.getDisk())) {
                continue;
            }

            String filterOS = filter.get("OS");
            if (filterOS != null
                    && !filterOS.equals(lp.getOS())) {
                continue;
            }
            String filterColor = filter.get("color");
            if (filterColor != null
                    && !filterColor.equals(lp.getColor())) {
                continue;
            }
            String filterPrice = filter.get("price");
            if (filterPrice != null
                    && !filterPrice.equals(lp.getPrice())) {
                continue;
            }
            itemSelect.add(lp);
        }
        if(itemSelect.isEmpty()){
            System.out.println();
            System.out.printf("К сожалению, ноутбуки по заданным критериям не найдены");

        }
        return itemSelect;
    }
}