package com.example.specialCharacter;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

public class SpecialCharacterController {

    private int generatedTextFontSize = 14;
    private int generatedTextBoxWidth = 120;

    private final String thinSpaceUnicode = "\u2009";
    private final String hairSpaceUnicode = "\u200A";
    private final String mongolianVowelSeparatorUnicode = "\u180E";
    private final String zeroWidthSpaceUnicode = "\u200B";
    private final String zeroWidthNonJoinerUnicode = "\u200C";
    private final String zeroWidthJoinerUnicode = "\u200D";
    private final String punctuationSpaceUnicode = "\u2008";
    private final String mediumMathSpaceUnicode = "\u200F";
    private final String sixPerEmSpaceUnicode = "\u2006";

    @FXML
    public Label thinSpaceLabel;

    @FXML
    public Label hairSpaceLabel;

    @FXML
    public Label mongolianVowelSeparatorLabel;

    @FXML
    public Label zeroWidthSpaceLabel;

    @FXML
    public Label zeroWidthNonJoinerLabel;

    @FXML
    public Label zeroWidthJoinerLabel;

    @FXML
    public Label punctuationSpaceLabel;

    @FXML
    public Label mediumMathSpaceLabel;

    @FXML
    public Label sixPerEmSpaceLabel;

    @FXML
    public TextField firstPartText;

    @FXML
    public TextField secondPartText;


    @FXML
    protected void onGenerateButtonClick() {
        thinSpaceLabel.setText(generateText(thinSpaceUnicode));
        thinSpaceLabel.setFont(Font.font(generatedTextFontSize));

        hairSpaceLabel.setText(generateText(hairSpaceUnicode));
        hairSpaceLabel.setFont(Font.font(generatedTextFontSize));

        mongolianVowelSeparatorLabel.setText(generateText(mongolianVowelSeparatorUnicode));
        mongolianVowelSeparatorLabel.setFont(Font.font(generatedTextFontSize));

        zeroWidthSpaceLabel.setText(generateText(zeroWidthSpaceUnicode));
        zeroWidthSpaceLabel.setFont(Font.font(generatedTextFontSize));

        zeroWidthNonJoinerLabel.setText(generateText(zeroWidthNonJoinerUnicode));
        zeroWidthNonJoinerLabel.setFont(Font.font(generatedTextFontSize));

        zeroWidthJoinerLabel.setText(generateText(zeroWidthJoinerUnicode));
        zeroWidthJoinerLabel.setFont(Font.font(generatedTextFontSize));

        punctuationSpaceLabel.setText(generateText(punctuationSpaceUnicode));
        punctuationSpaceLabel.setFont(Font.font(generatedTextFontSize));

        mediumMathSpaceLabel.setText(generateText(mediumMathSpaceUnicode));
        mediumMathSpaceLabel.setFont(Font.font(generatedTextFontSize));

        sixPerEmSpaceLabel.setText(generateText(sixPerEmSpaceUnicode));
        sixPerEmSpaceLabel.setFont(Font.font(generatedTextFontSize));

        updateLabelsTextBoxWidth();
    }

    @FXML
    protected void onIncrementFontButton() {
        generatedTextFontSize += 2;
        updateLabelsFontSize();
    }

    @FXML
    protected void onDecrementFontButton() {
        if (generatedTextFontSize <= 2) {
            return;
        }
        generatedTextFontSize -= 2;
        updateLabelsFontSize();

    }

    @FXML
    protected void onIncrementTextBoxWidthButton() {
        generatedTextBoxWidth += 10;
        updateLabelsTextBoxWidth();
    }

    @FXML
    protected void onDecrementTextBoxWidthButton() {
        if (generatedTextBoxWidth <= 10) {
            return;
        }
        generatedTextBoxWidth -= 10;
        updateLabelsTextBoxWidth();
    }

    private void updateLabelsFontSize() {
        thinSpaceLabel.setFont(Font.font(generatedTextFontSize));
        hairSpaceLabel.setFont(Font.font(generatedTextFontSize));
        mongolianVowelSeparatorLabel.setFont(Font.font(generatedTextFontSize));
        zeroWidthSpaceLabel.setFont(Font.font(generatedTextFontSize));
        zeroWidthNonJoinerLabel.setFont(Font.font(generatedTextFontSize));
        zeroWidthJoinerLabel.setFont(Font.font(generatedTextFontSize));
        punctuationSpaceLabel.setFont(Font.font(generatedTextFontSize));
        mediumMathSpaceLabel.setFont(Font.font(generatedTextFontSize));
        sixPerEmSpaceLabel.setFont(Font.font(generatedTextFontSize));
    }

    private void updateLabelsTextBoxWidth() {
        thinSpaceLabel.setMinWidth(generatedTextBoxWidth);
        thinSpaceLabel.setMaxWidth(generatedTextBoxWidth);
        hairSpaceLabel.setMinWidth(generatedTextBoxWidth);
        hairSpaceLabel.setMaxWidth(generatedTextBoxWidth);
        mongolianVowelSeparatorLabel.setMinWidth(generatedTextBoxWidth);
        mongolianVowelSeparatorLabel.setMaxWidth(generatedTextBoxWidth);
        zeroWidthSpaceLabel.setMinWidth(generatedTextBoxWidth);
        zeroWidthSpaceLabel.setMaxWidth(generatedTextBoxWidth);
        zeroWidthNonJoinerLabel.setMinWidth(generatedTextBoxWidth);
        zeroWidthNonJoinerLabel.setMaxWidth(generatedTextBoxWidth);
        zeroWidthJoinerLabel.setMinWidth(generatedTextBoxWidth);
        zeroWidthJoinerLabel.setMaxWidth(generatedTextBoxWidth);
        punctuationSpaceLabel.setMinWidth(generatedTextBoxWidth);
        punctuationSpaceLabel.setMaxWidth(generatedTextBoxWidth);
        mediumMathSpaceLabel.setMinWidth(generatedTextBoxWidth);
        mediumMathSpaceLabel.setMaxWidth(generatedTextBoxWidth);
        sixPerEmSpaceLabel.setMinWidth(generatedTextBoxWidth);
        sixPerEmSpaceLabel.setMaxWidth(generatedTextBoxWidth);
    }

    private String generateText(String specialChar) {
        return firstPartText.getText() + specialChar + secondPartText.getText();
    }
}