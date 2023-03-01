package texFilter;

import javax.swing.*;
import javax.swing.text.*;

public class TextFilter extends JTextField {

    private int limit;

    public TextFilter(int limit) {
        super();
        this.limit = limit;
    }

    @Override
    protected Document createDefaultModel() {
        return new FilterDocument(limit);
    }

    private class FilterDocument extends PlainDocument {

        private int limit;

        public FilterDocument(int limit) {
            super();
            this.limit = limit;
        }

        @Override
        public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
            if (str == null)
                return;

            String newString = getText(0, getLength()) + str;

            if (newString.length() <= limit)
                super.insertString(offs, str, a);
            else
                JOptionPane.showMessageDialog(null, "Número máximo de caracteres atingido.");
        }
    }
}


