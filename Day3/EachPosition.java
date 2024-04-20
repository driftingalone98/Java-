class EachPosition{
    public static void main(String[] args){
        int num = 153;
        int bai = num / 100;
        int shi = num / 10 - 10 * bai;
        int ge = num - bai * 100 - shi * 10;
        System.out.println("数字为" + num + " 百位/十位/个位" + bai + "/" + shi + "/" + ge);
    }
}