package Day2;

/**
 * Created by pintsizedev
 */
public class WorkOutTotalArea implements Day2.UseCase.WorkOutTotalArea{
    @Override
    public int getTotalArea(int length, int width, int height) {
        return (2 * length * width) + (2 * length * height) + (2 * width * height);
    }
}
