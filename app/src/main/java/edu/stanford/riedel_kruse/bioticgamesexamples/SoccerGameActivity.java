package edu.stanford.riedel_kruse.bioticgamesexamples;

import android.os.Bundle;

import org.opencv.core.Mat;

import edu.stanford.riedel_kruse.bioticgamessdk.BioticGameActivity;

/**
 * Created by dchiu on 1/31/15.
 */
public class SoccerGameActivity extends BioticGameActivity {
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
    protected void initGame(int rows, int cols) {

    }

    @Override
    protected void updateGame(Mat frame, long timeDelta) {

    }
}
