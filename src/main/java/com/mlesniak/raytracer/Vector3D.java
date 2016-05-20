package com.mlesniak.raytracer;

/**
 * Vector3D library.
 *
 * @author Michael Lesniak (mlesniak@micromata.de)
 */
public class Vector3D {
    public final double x;
    public final double y;
    public final double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector3D normalize() {
        double len = length();
        return new Vector3D(x / len, y / len, z / len);
    }
}
