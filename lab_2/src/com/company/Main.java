package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Point3d[] dot = new Point3d[3]; //массив из трех точек-объектов
        for (int i = 0; i <= 2; i++) //ввод координат точек
        {
            dot[i] = new Point3d();
            dot[i].setX(scanner.nextDouble());
            dot[i].setY(scanner.nextDouble());
            dot[i].setZ(scanner.nextDouble());
        }
        if (checking(dot[0], dot[1], dot[2])) System.out.println("Площадь равна: " + computeArea(dot[0], dot[1], dot[2]));
        else System.out.println("Какие-то точки равны, невозможно вычислить площадь");
    }

    public static double computeArea(Point3d dot1, Point3d dot2, Point3d dot3) //метод для расчета площади
    {
        double p;
        p = (dot1.distanceTo(dot2) + dot1.distanceTo(dot3) + dot2.distanceTo(dot3)) / 2;
        return Math.sqrt(p * (p - dot1.distanceTo(dot2)) * (p - dot1.distanceTo(dot3)) * (p - dot2.distanceTo(dot3)));
    }
    public static boolean checking(Point3d dot1, Point3d dot2, Point3d dot3) //проверка координат точек
    {
        if (((dot1.getX() == dot2.getX()) && (dot1.getY() == dot2.getY()) && (dot1.getZ() == dot2.getZ())) ||
                ((dot1.getX() == dot3.getX()) && (dot1.getY() == dot3.getY()) && (dot1.getZ() == dot3.getZ())) ||
                ((dot2.getX() == dot3.getX()) && (dot2.getY() == dot3.getY()) && (dot2.getZ() == dot3.getZ())))
            return false;
        else return true;
    }
}
