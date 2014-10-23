

package <%packagename%>.datalayer.ajax.service;

import java.util.List;
import java.util.Map;


public interface AbstractAJAXServices {
	public List load(Map map);
	public List loadMulti(Map map);
    public Object loadSingle(Map map);
}
