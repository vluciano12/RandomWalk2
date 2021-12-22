public class RandomWalk{
    public static void main(String[] args) {
        Rectangle field = new Rectangle(0,0,300,300);
        field.setColor(Color.GREEN);
        field.draw();
        field.fill();
        Ellipse bounds = new Ellipse(50, 50, 200, 200);
        bounds.draw();
        Ellipse walker = new Ellipse(150, 150, 10, 10);
        walker.setColor(Color.RED);
        walker.draw();
        walker.fill();
        int walkerX = walker.getX();
        int walkerY = walker.getY();
        int distance = (int)(Math.sqrt(Math.pow((walkerX - 150),2))) + (int)(Math.sqrt(Math.pow((walkerY - 150),2)));
        while(distance <= 150){
            int stepCount = 0;
            int randomX = (int)((Math.random()*20) - 10);
            int randomY = (int)((Math.random()*20) - 10);
            walker.translate(randomX, randomY);
            stepCount += 1;
            try { Thread.sleep(100);}
            catch(Exception ex) {};
            distance = (int)(Math.sqrt(Math.pow((walkerX - 150),2))) + (int)(Math.sqrt(Math.pow((walkerY - 150),2)));
            walkerX = walker.getX();
            walkerY = walker.getY();
        }
    }
}