package com.shildt.chapter2021.io;

import java.io.*;

/**
 * Created by Max Hluhov on 09.10.2018.
 */
public class DataIODemo {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src\\main\\java\\com\\shildt\\chapter2021\\io\\Test.dat");
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
        try  {
            dos.writeDouble(98.8);
            dos.writeInt(1000);
            dos.writeBoolean(true);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }finally {
            try {
                dos.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }

        try (DataInputStream din =
        new DataInputStream(new FileInputStream(file))) {
            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();
            System.out.println("Получаемые значения: " +
                    d + " " + i + " " + b);
        }catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
