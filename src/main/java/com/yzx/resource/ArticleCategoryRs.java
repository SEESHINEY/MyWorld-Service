package com.yzx.resource;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

import com.yzx.dao.ArticleCategoryDao;
import com.yzx.dao.impl.ArticleCategoryDaoImpl;
import com.yzx.entity.ArticleCategory;
import com.yzx.factory.ArticleFactory;
import com.yzx.factory.impl.ArticleFactoryImpl;
import com.yzx.util.HUtil;

@Path("articleCategory")
@XmlRootElement
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})

public class ArticleCategoryRs {
	private ArticleCategoryDao articleCategoryDao;
	private ArticleCategory articleCategory;
	public ArticleCategoryRs() {
		super();
		articleCategoryDao = new ArticleCategoryDaoImpl(HUtil.getSessionFactory());
		ArticleFactory articleFactory = new ArticleFactoryImpl();
		articleCategory = (ArticleCategory) articleFactory
				.createArticleCategeory();
	}

	@GET
	public ArticleCategory getCategories(){
		return articleCategory;
	}
	@GET
	@Path("/{name}")
	public ArticleCategory getCategories(@PathParam("name")String name){
		return articleCategory;
	}
}
