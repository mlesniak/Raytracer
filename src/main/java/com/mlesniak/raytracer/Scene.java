package com.mlesniak.raytracer;

/**
 * Describe a full scene.
 * <p>
 * We use YAML serialization to store a scene as a readable and editable file.
 *
 * @author Michael Lesniak (mlesniak@micromata.de)
 */
public class Scene {
    private String filename;
    private Vector3D camera;

    private View view;

    /**
     * Viewport description.
     */
    public static class View {
        public Vector3D lowerLeft;
        public Vector3D upperRight;

        public Vector3D getLowerLeft() {
            return lowerLeft;
        }

        public void setLowerLeft(Vector3D lowerLeft) {
            this.lowerLeft = lowerLeft;
        }

        public Vector3D getUpperRight() {
            return upperRight;
        }

        public void setUpperRight(Vector3D upperRight) {
            this.upperRight = upperRight;
        }

        @Override
        public String toString() {
            return "View{" +
                    "lowerLeft=" + lowerLeft +
                    ", upperRight=" + upperRight +
                    '}';
        }
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Vector3D getCamera() {
        return camera;
    }

    public void setCamera(Vector3D camera) {
        this.camera = camera;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    @Override
    public String toString() {
        return "Scene{" +
                "filename='" + filename + '\'' +
                ", camera=" + camera +
                ", view=" + view +
                '}';
    }
}
