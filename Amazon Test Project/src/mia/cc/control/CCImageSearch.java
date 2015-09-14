package mia.cc.control;

import java.util.ArrayList;
import java.util.List;

import mia.cc.models.CCImage;

import com.amazonaws.services.ec2.model.DescribeImagesRequest;
import com.amazonaws.services.ec2.model.DescribeImagesResult;
import com.amazonaws.services.ec2.model.Filter;
import com.amazonaws.services.ec2.model.Image;

/**
 * Classe para fazer a busca de imagens
 * @author Yvens
 *
 */
public class CCImageSearch {
	
	/**
	 * Busca todas as imagens sem utilizar filtro. 
	 * O mecanismo default faz um tipo de paginação, então nem todas virão nessa chamada assim.
	 * @return
	 */
	public List<CCImage> describeImages()
	{
		return describeImages(null);
	}
	
	/**
	 * Busca todas as imagens de acordo com o filtro passado
	 * @param filters
	 * @return
	 */
	public List<CCImage> describeImages(List<Filter> filters)
	{
		DescribeImagesRequest request = new DescribeImagesRequest();
		if(filters != null)
		{
			for(Filter filter : filters)
			{
				request.getFilters().add(filter);
			}
		}
		
		DescribeImagesResult result = CCConnection.getInstance().getEc2().describeImages(request);
		List<Image> images = result.getImages();
		List<CCImage> rimages = new ArrayList<CCImage>();
		
		for(Image image : images)
		{
			rimages.add(new CCImage(image));
		}
		
		return rimages;
	}
	
}
