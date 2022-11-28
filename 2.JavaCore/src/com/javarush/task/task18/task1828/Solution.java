package com.javarush.task.task18.task1828;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Прайсы 2
*/

public class Solution {
    public static class Product {
        int id;
        String name;
        String price;
        String quantity;

        public Product(int id, String name, String price, String quantity) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return String.format("%-8d%-30s%-8s%-4s", id, name, price, quantity);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        List<Product> products = new ArrayList<>();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while (fileReader.ready()) {
                Product product = getProduct(fileReader.readLine());
                products.add(product);
            }
        }

        switch (args[0]) {
            case "-u": {
                int id = Integer.parseInt(args[1]);
                String name = "";
                for (int i = 2; i < args.length - 2; i++) {
                    name += args[i] + " ";
                }
                if (name.length() > 30) {
                    name = name.substring(0, 30);
                }
                String price = args[args.length - 2];
                if (price.length() > 8) {
                    price = price.substring(0, 8);
                }
                String quantity = args[args.length - 1];
                if (quantity.length() > 4) {
                    quantity = quantity.substring(0, 4);
                }
                Product productToUpdate = null;
                for (Product product : products) {
                    if (product.id == id) productToUpdate = product;
                }
                if (productToUpdate != null) {
                    productToUpdate.name = name;
                    productToUpdate.price = price;
                    productToUpdate.quantity = quantity;
                }
                break;
            }
            case "-d": {
                int id = Integer.parseInt(args[1]);
                Product productToDelete = null;
                for (Product product : products) {
                    if (product.id == id) productToDelete = product;
                }
                if (productToDelete != null) products.remove(productToDelete);
                break;
            }
        }

        try (FileWriter fileWriter = new FileWriter(fileName)) {
            for (Product product : products) {
                fileWriter.write(product.toString());
                fileWriter.write("\n");
            }
        }
    }

    public static Product getProduct(String string) {
        String id = string.substring(0, 8).trim();
        String name = string.substring(8, 38).trim();
        String price = string.substring(38, 46).trim();
        String quantity = string.substring(46, 50).trim();
        return new Product(Integer.parseInt(id), name, price, quantity);
    }
}

//My working old version
//public class Solution {
//
//    public static void main(String[] args) throws Exception {
//        String fileName = "";
//
//        if (args == null || args.length < 1) {
//            System.out.println("Введіть CRUD набор параметрів в конфігурації запуску й спробуйте знову.");
//            return;
//        }
//        if (!(args[0].equals("-u") || args[0].equals("-d"))) {
//            System.out.println("Перший параметр має бути \"-с\" або \"-d\". Спробуйте знову.");
//            return;
//        }
//        System.out.println("Введіть шлях та ім'я до файлу для операцій CRUD:");
//
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            fileName = reader.readLine();
//        }
//        try (FileReader fileReader = new FileReader(fileName);
//             BufferedReader br = new BufferedReader(fileReader);
//        ) {
//
//
//            TreeMap<Integer, String> map = new TreeMap<Integer, String>();
//            String line = "";
//            String line2 = "";
//            StringBuilder builder = new StringBuilder(line2);
//            int nextChar = 0;
//            char chars;
//            int key = 0;
//            String value = "";
//            while ((line = br.readLine()) != null) {
//                for (int i = 0; i < 8; i++) {
//                    nextChar = Character.getNumericValue(line.charAt(i));
//                    if (nextChar > 0) builder.append(nextChar);
//                }
//                key = Integer.parseInt(String.valueOf(builder));
//                builder.delete(0, 8);
//                for (int i = 8; i < 50; i++) {
//                    chars = line.charAt(i);
//                    builder.append(chars);
//                }
//                value = String.valueOf(builder);
//                builder.delete(0, 50);
//                map.put(key, value);
//            }
//
//            try (FileWriter fileWriter = new FileWriter(fileName);) {
//
//                if (args[0].equals("-u")) {
//                    String param1 = String.format("%-" + 8 + "s", args[1]).substring(0, 8);
//                    String param2 = String.format("%-" + 30 + "s", args[2]).substring(0, 30);
//                    String param3 = String.format("%-" + 8 + "s", args[3]).substring(0, 8);
//                    String param4 = String.format("%-" + 4 + "s", args[4]).substring(0, 4);
//                    if (map.containsKey(Integer.parseInt(args[1]))) {
//                        map.put(Integer.parseInt(param1.trim()), param2 + param3 + param4);
//                        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//                            fileWriter.write(String.format("%-" + 8 + "s", entry.getKey()) +
//                                    String.format("%-" + 42 + "s", entry.getValue()));
//                            fileWriter.write("\n");
//                        }
//                    }
//                }
//
//                if (args[0].equals("-d")) {
//                    String param1 = String.format("%-" + 8 + "s", args[1]).substring(0, 8);
//                    if (map.containsKey(Integer.parseInt(args[1]))) {
//                        map.remove(Integer.parseInt(param1.trim()));
//                        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//                            fileWriter.write(String.format("%-" + 8 + "s", entry.getKey()) +
//                                    String.format("%-" + 42 + "s", entry.getValue()));
//                            fileWriter.write("\n");
//                        }
//                    }
//                }
//
//            }
//        }
//    }
//}


