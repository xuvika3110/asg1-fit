package com.nguyenDat.PaneGoogle;

import javax.swing.*;
import java.awt.*;

public class OutputG {
    private static JTextArea Output;

    public static JTextArea getOutput() {
        return Output;
    }

    public OutputG() {
        Output = new JTextArea();
        Output.setBounds(30, 300, 800, 300);
        Output.setBorder(BorderFactory.createLineBorder(new Color(0x07658F), 3));
        Output.setLineWrap(true);
        Output.setWrapStyleWord(true);

        PaneGoogleTranslate.getPaneGoogleTranslate().add(Output);
    }
}
