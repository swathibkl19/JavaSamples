//// Draws a given number of dots on this die
//
//private void drawDots(Graphics g, int x, int y, int numDots)
//        {
//        g.setColor(Color.WHITE);
//
//        int dotSize = dieSize / 4;
//        int step = dieSize / 8;
//        int x1 = x + step - 1;
//        int x2 = x + 3*step;
//        int x3 = x + 5*step + 1;
//        int y1 = y + step - 1;
//        int y2 = y + 3*step;
//        int y3 = y + 5*step + 1;
//
//        switch (numDots)
//        {
//        case 1:
//        g.fillOval(x2, y2, dotSize, dotSize);
//        break;
//        case 2:
//        g.fillOval(x3, y1, dotSize, dotSize);
//        g.fillOval(x1, y3, dotSize, dotSize);
//        break;
//        case 3:
//        g.fillOval(x1, y1, dotSize, dotSize);
//        g.fillOval(x2, y2, dotSize, dotSize);
//        g.fillOval(x3, y3, dotSize, dotSize);
//        break;
//        case 4:
//        g.fillOval(x1, y1, dotSize, dotSize);
//        g.fillOval(x3, y3, dotSize, dotSize);
//        g.fillOval(x1, y3, dotSize, dotSize);
//        g.fillOval(x3, y3, dotSize, dotSize);
//        break;
//        case 5:
//        g.fillOval(x1, y1, dotSize, dotSize);
//        g.fillOval(x2, y2, dotSize, dotSize);
//        g.fillOval(x3, y1, dotSize, dotSize);
//        g.fillOval(x1, y3, dotSize, dotSize);
//        g.fillOval(x3, y3, dotSize, dotSize);
//        break;
//        case 6:
//        g.fillOval(x1, y1, dotSize, dotSize);
//        g.fillOval(x2, y1, dotSize, dotSize);
//        g.fillOval(x3, y1, dotSize, dotSize);
//        g.fillOval(x1, y3, dotSize, dotSize);
//        g.fillOval(x2, y3, dotSize, dotSize);
//        g.fillOval(x3, y3, dotSize, dotSize);
//        break;
//
//
//        }
//
//        }
//        }
