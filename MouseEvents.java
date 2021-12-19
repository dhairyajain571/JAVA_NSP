import java.applet.*;
import java.awt.*;
import java.awt.event.*;
 
/* <APPLET CODE="MouseEvents.class" WIDTH="300" HEIGHT="300">
   </APPLET>
*/
 
public class MouseEvents extends Applet implements MouseListener, MouseMotionListener {
 
 String message = "";
 int x,y;
 
 public void init() {
  
  setBackground(Color.YELLOW);
  addMouseListener(this);
  addMouseMotionListener(this);
 }
 
 public void paint(Graphics g) {
  g.drawString(message, 50, 50);

  g.setColor(Color.BLACK);  
   g.fillOval(x,y,30,30); 
 }
 
 public void mouseEntered(MouseEvent me) {
  setBackground(Color.PINK);
  message = "Mouse Entered: (" + me.getX() + ", " + me.getY() + ")";
  repaint();
 }
 
  

 public void mouseExited(MouseEvent me) {
  setBackground(Color.RED);
  message = "Mouse Exited: (" + me.getX() + ", " + me.getY() + ")";
  repaint();
 }
 
 public void mouseClicked(MouseEvent me) {
  setBackground(Color.CYAN);
  message = "Mouse Clicked: (" + me.getX() + ", " + me.getY() + ")";
  x = me.getX();
  y = me.getY();
  repaint();
 }
 
 public void mousePressed(MouseEvent me) {
  setBackground(Color.MAGENTA);
  message = "Mouse Pressed: (" + me.getX() + ", " + me.getY() + ")";
  repaint();
 }
 
 public void mouseReleased(MouseEvent me) {
  setBackground(Color.GREEN);
  message = "Mouse Released: (" + me.getX() + ", " + me.getY() + ")";
  repaint();
 }
 
 public void mouseMoved(MouseEvent me) {
  setBackground(Color.ORANGE);
  message = "Mouse Moved: (" + me.getX() + ", " + me.getY() + ")";
  repaint();
 }
 
 public void mouseDragged(MouseEvent me) {
  setBackground(Color.GRAY);
  message = "Mouse Dragged: (" + me.getX() + ", " + me.getY() + ")";
  x = me.getX();
  y = me.getY();
  repaint();
 }
}