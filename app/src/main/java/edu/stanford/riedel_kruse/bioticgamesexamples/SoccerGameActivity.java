package edu.stanford.riedel_kruse.bioticgamesexamples;

import android.os.Bundle;
import android.widget.Toast;

import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;

import edu.stanford.riedel_kruse.bioticgamessdk.BioticGameActivity;
import edu.stanford.riedel_kruse.bioticgamessdk.Circle;
import edu.stanford.riedel_kruse.bioticgamessdk.CollisionCallback;
import edu.stanford.riedel_kruse.bioticgamessdk.Rectangle;

/**
 * Created by dchiu on 1/31/15.
 */
public class SoccerGameActivity extends BioticGameActivity {
    private Circle mBall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_soccer_game);
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getCameraViewResourceId() {
        return R.id.camera_view;
    }

    @Override
    protected void initGame(final int rows, final int cols) {
        int goalLength = rows * 3 / 4;
        int goalWidth = 10;
        int goalY = (rows - goalLength) / 2;
        LeftGoal redGoal = new LeftGoal(new Point(0, goalY), goalWidth, goalLength,
                new Scalar(255, 0, 0));
        addGameObject(redGoal);

        RightGoal blueGoal = new RightGoal(new Point(cols - goalWidth, goalY), goalWidth,
                goalLength, new Scalar(0, 0, 255));
        addGameObject(blueGoal);

        mBall = new Circle(new Point(cols / 2, rows / 2), 20, new Scalar(255, 0, 0), 1, true);
        addGameObject(mBall);

        addCollisionCallback(new CollisionCallback(mBall, blueGoal) {
            @Override
            public void onCollision() {
                mBall.position().x = cols / 2;
                mBall.position().y = rows / 2;
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(), "Goal!", Toast.LENGTH_LONG).show();
                    }
                });
            }
        });
    }

    @Override
    protected void updateGame(Mat frame, long timeDelta) {
        mBall.position().x += 10;
    }
}
