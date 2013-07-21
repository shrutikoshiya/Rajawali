package rajawali.curves;

import rajawali.math.Vector3;

public interface ICurve3D {

	public Vector3 calculatePoint(Vector3 result,float t);

	public Vector3 getCurrentTangent();

	public void setCalculateTangents(boolean calculateTangents);
}
