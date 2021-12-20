package Square;

public class Rectangle {
    private float width;
    private float height;
    //khai báo
    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }
    // khởi tạo

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    //tính chu vi
    public float chuVi(){
        return (width+height)*2;
    }
    //tính diện tích
    public float dienTich(){
        return width*height;
    }
    //in ra màn hình
    public void inRaManHinh(){
        System.out.println("Width :"+width);
        System.out.println("Height :"+height);
    }
    // kiểm tra hình vuông
    public boolean kiemTraHinhVuong(){
        if (width == height){
            return true;
        }else {
            return false;
        }
    }
}



