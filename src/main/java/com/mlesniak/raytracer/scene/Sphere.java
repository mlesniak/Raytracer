package com.mlesniak.raytracer.scene;

import com.mlesniak.raytracer.Vector3D;

import java.util.Optional;

/**
 * Sphere object with center and radius.
 *
 * @author Michael Lesniak (mlesniak@micromata.de)
 */
public class Sphere extends SceneObject {
    public Vector3D center;
    public double radius;

    public Sphere() {
        center = new Vector3D(0, 0, 0);
    }

    @Override
    public Optional<Vector3D> intersect(Vector3D origin, Vector3D ray) {
        // Use code for book, optimize later.
        // double a = 1;
        double b =
                2 * (ray.x * (origin.x - center.x) + ray.y * (origin.y - center.y) + ray.z * (origin.z - center.z));
        double c = (origin.x - center.x) * (origin.x - center.x) + (origin.y - center.y) * (origin.y - center.y) +
                (origin.z - center.z) * (origin.z - center.z) - (radius * radius);

        double disc = b * b - 4 * c;
        if (disc < 0) {
            return Optional.empty();
        }

        double t0 = (-b - Math.sqrt(disc)) / 2;
        double t1 = (-b + Math.sqrt(disc)) / 2;

        double t = Math.min(t0, t1);
        // Intersection point is...
        Vector3D intersection = new Vector3D(origin.x + ray.x * t, origin.z + ray.z * t, origin.z + ray.z * t);

        return Optional.of(intersection);
    }

    public Vector3D getCenter() {
        return center;
    }

    public void setCenter(Vector3D center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
