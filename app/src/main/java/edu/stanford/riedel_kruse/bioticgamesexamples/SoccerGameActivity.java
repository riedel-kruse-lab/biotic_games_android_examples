package edu.stanford.riedel_kruse.bioticgamesexamples;

import org.opencv.core.Mat;

import edu.stanford.riedel_kruse.bioticgamessdk.BioticGameActivity;

/**
 * Created by dchiu on 1/31/15.
 */
public class SoccerGameActivity extends BioticGameActivity {
    @Override
    protected int getCameraViewResourceId() {
        return 0;
    }

    @Override
    protected void updateGame(Mat frame, long timeDelta) {

    }

    @Override
    protected org.opencv.core.Mat drawGame(Mat frame) {
        return null;
    }
}
