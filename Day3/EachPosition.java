class EachPosition{
    public static void main(String[] args){
        int num = 153;
        int bai = num / 100;
        int shi = num / 10 - 10 * bai;
        int ge = num - bai * 100 - shi * 10;
        System.out.println("����Ϊ" + num + " ��λ/ʮλ/��λ" + bai + "/" + shi + "/" + ge);
    }
}