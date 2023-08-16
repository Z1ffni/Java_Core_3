class Тварина {
    private String назва;
    private double швидкість;
    private int вік;

    public Тварина(String назва, double швидкість, int вік) {
        this.назва = назва;
        this.швидкість = швидкість;
        this.вік = вік;
    }

    public String getНазва() {
        return назва;
    }

    public double getШвидкість() {
        return швидкість;
    }

    public int getВік() {
        return вік;
    }

    public void setНазва(String назва) {
        this.назва = назва;
    }

    public void setШвидкість(double швидкість) {
        this.швидкість = швидкість;
    }

    public void setВік(int вік) {
        this.вік = вік;
    }

    public static void main(String[] args) {
        Тварина тварина = new Тварина("Леопард", 20, 7);

        System.out.println("Назва тварини = " + тварина.getНазва() +
                           ", Швидкість тварини = " + тварина.getШвидкість() + " км/год" +
                           ", Вік тварини = " + тварина.getВік() + " років");

        тварина.setНазва("Бик");
        тварина.setШвидкість(2);
        тварина.setВік(14);

        System.out.println("Назва тварини = " + тварина.getНазва() +
                           ", Швидкість тварини = " + тварина.getШвидкість() + " км/год" +
                           ", Вік тварини = " + тварина.getВік() + " років");
    }
}