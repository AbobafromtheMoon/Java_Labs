package com.company;

public class Point3d
{
    private double xCoord; //координаты точки в трехмерном пространстве
    private double yCoord;
    private double zCoord;

    public Point3d (double x, double y, double z) //конструктор инициализации точек
    {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    public Point3d() //конструктор по умолчанию
    {
        this(0.0,0.0,0.0);
    }
    public double getX() //возвращение координаты х
    {
        return xCoord;
    }
    public double getY() //возвращение координаты у
    {
        return yCoord;
    }
    public double getZ() //возвращение координаты z
    {
        return zCoord;
    }
    public void setX(double val) //установка значения х
    {
        xCoord = val;
    }
    public void setY(double val) //установка значения у
    {
        yCoord = val;
    }
    public void setZ(double val) //установка значения z
    {
        zCoord = val;
    }
    public double distanceTo(Point3d s) //метод поиска расстояния между точками
    {
        double X = this.xCoord - s.xCoord;
        double Y = this.yCoord - s.yCoord;
        double Z = this.zCoord - s.zCoord;
        return (Math.sqrt(X * X + Y * Y + Z * Z));
    }
}
