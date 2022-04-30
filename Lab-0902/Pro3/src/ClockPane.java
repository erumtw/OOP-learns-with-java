import java.util.Calendar;
import java.util.GregorianCalendar;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle; 
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;

public  class ClockPane extends Pane {
    private int hr;
    private int min;
    private int sec;
    private boolean hrHandVisible;
    private boolean minHandVisible;
    private boolean secHandVisible;

    ClockPane () {
        setCurrentTime();
    }

    ClockPane (int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
        hrHandVisible = minHandVisible = secHandVisible = true;
        paintClock();
    }
    
    public int getHr() {
        return this.hr;
    }

    public void setHr(int hr) {
        this.hr = hr;
        paintClock();
    }

    public int getMin() {
        return this.min;
    }

    public void setMin(int min) {
        this.min = min;
        paintClock();
    }

    public int getSec() {
        return this.sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
        paintClock();
    }

    public boolean isHrHandVisible() {
        return this.hrHandVisible;
    }

    public boolean getHrHandVisible() {
        return this.hrHandVisible;
    }

    public void setHrHandVisible(boolean hrHandVisible) {
        this.hrHandVisible = hrHandVisible;
        paintClock();
    }

    public boolean isMinHandVisible() {
        return this.minHandVisible;
    }

    public boolean getMinHandVisible() {
        return this.minHandVisible;
    }

    public void setMinHandVisible(boolean minHandVisible) {
        this.minHandVisible = minHandVisible;
        paintClock();
    }

    public boolean isSecHandVisible() {
        return this.secHandVisible;
    }
    
    public boolean getSecHandVisible() {
        return this.secHandVisible;
    }
    
    public void setSecHandVisible(boolean secHandVisible) {
        this.secHandVisible = secHandVisible;
        paintClock();
    }
    
    public void setCurrentTime() {
        Calendar time = new GregorianCalendar();
        this.hr = time.get(Calendar.HOUR_OF_DAY);
        this.min = time.get(Calendar.MINUTE);
        this.sec = time.get(Calendar.SECOND);
        paintClock(); //repaint
    }

    //Paint the clock
    public void paintClock() {
        //Initailize clock parameters
        double clockRadius = Math.min(getWidth(), getHeight()) * 0.8 * 0.5;
        double centerX = getWidth() / 2;
        double centerY = getHeight() / 2;

        //Draw circle
        Circle circle = new Circle();
        circle.setCenterX(centerX);
        circle.setCenterY(centerY);
        circle.setRadius(clockRadius);
        circle.setFill(Color.BLACK);
        circle.setStroke(Color.AZURE);
        Text xii = new Text(centerX - 5 , centerY - clockRadius + 12, "XII");
        xii.setFill(Color.AZURE);
        Text ix = new Text(centerX - clockRadius + 3, centerY + 5, "IX");
        ix.setFill(Color.AZURE);
        Text iii = new Text(centerX + clockRadius - 11, centerY + 3, "III");
        iii.setFill(Color.AZURE);
        Text vi = new Text(centerX - 3, centerY + clockRadius - 3, "VI");
        vi.setFill(Color.AZURE);

        //Draw second hand
        double sLength = clockRadius * 0.8;
        double secX = centerX + sLength * Math.sin(sec * (2 * Math.PI / 60));
        double secY = centerY - sLength * Math.cos(sec * (2 * Math.PI / 60));
        Line secLine = new Line(centerX, centerY, secX, secY);
        secLine.setStroke(Color.BLUE);

        //Draw minute hand
        double mLength = clockRadius * 0.65;
        double minX = centerX + mLength * Math.sin(min * (2 * Math.PI / 60));
        double minY = centerY - mLength * Math.cos(min * (2 * Math.PI / 60));
        Line minLine = new Line(centerX, centerY, minX, minY);
        minLine.setStroke(Color.RED);

        //Draw hour hand
        double hLength = clockRadius * 0.8;
        double hrX = centerX + hLength * Math.sin((hr % 12 + min / 60.0) * (2 * Math.PI / 12));
        double hrY = centerY - hLength * Math.cos((hr % 12 + min / 60.0) * (2 * Math.PI / 12));
        Line hrLine = new Line(centerX, centerY, hrX, hrY);
        hrLine.setStroke(Color.YELLOW);

        getChildren().clear();
        getChildren().addAll(circle, xii, ix, iii, vi);

        if (secHandVisible)
			getChildren().add(secLine);
		if (minHandVisible)
			getChildren().add(minLine);
		if (hrHandVisible)
			getChildren().add(hrLine);
    }


    @Override
    protected void setWidth(double w) {
        // TODO Auto-generated method stub
        super.setWidth(w);
        paintClock();
    }

    @Override
    protected void setHeight(double h) {
        // TODO Auto-generated method stub
        super.setHeight(h);
        paintClock();
    }
}
