package com.microserviceprojectdemo.moviecatalogservice.resource;

import com.microserviceprojectdemo.moviecatalogservice.models.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatologResource {

    @RequestMapping("/{userID}")
    public List<CatalogItem> getCatalog(@PathVariable("userID") String userID)
    {
        return Collections.singletonList(
                new CatalogItem("Transformers", "Very Good", 4)
        );
    }
}
