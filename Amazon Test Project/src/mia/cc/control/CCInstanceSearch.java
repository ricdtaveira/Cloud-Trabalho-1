package mia.cc.control;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import mia.cc.models.CCInstance;

import com.amazonaws.services.ec2.model.DescribeInstancesResult;
import com.amazonaws.services.ec2.model.Instance;
import com.amazonaws.services.ec2.model.Reservation;

public class CCInstanceSearch {
	
	/**
	 * Busca todas as imagens sem utilizar filtro. 
	 * O mecanismo default faz um tipo de paginação, então nem todas virão nessa chamada assim.
	 * @return
	 */
	public List<CCInstance> listInstance()
	{
		List<CCInstance> list = new ArrayList<CCInstance>();
        
        DescribeInstancesResult describeInstancesRequest = CCConnection.getInstance().getEc2().describeInstances();
        List<Reservation> reservations = describeInstancesRequest.getReservations();
        Set<Instance> instances = new HashSet<Instance>();

        for (Reservation reservation : reservations) {
            instances.addAll(reservation.getInstances());
        }

        for(Instance instance : instances)
        {
        	CCInstance ccinstance = new CCInstance(instance);
        	list.add(ccinstance);
        }
        
		return list;
	}
}
