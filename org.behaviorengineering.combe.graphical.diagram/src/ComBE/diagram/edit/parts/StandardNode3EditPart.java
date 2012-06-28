package ComBE.diagram.edit.parts;

import org.eclipse.draw2d.Graphics;

import ComBE.StandardNode;
import ComBE.diagram.customCode.CustomPainting;

/**
 * @generated
 */
public class StandardNode3EditPart extends ShapeNodeEditPart {

	/**
	* @generated NOT
	*/
	private View view;
	
	/**
	* @generated NOT
	*/
	public StandardNode3EditPart(View view) {
		super(view);
		this.view = view;
	}

	/**
	 * @generated
	 */
	public class NodeFigure extends RectangleFigure {

		/**
		 * @generated NOT
		 */
		public void paint(Graphics graphics) {
			CustomPainting.setNodeColor(this, (StandardNode) view.getElement());
			CustomPainting.setBehaviorLabel(fFigureNodeBehaviorLabelFigure, (StandardNode) view.getElement());			
			super.paint(graphics);
		}
	}
}