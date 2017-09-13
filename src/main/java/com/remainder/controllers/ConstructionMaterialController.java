package com.remainder.controllers;

import com.remainder.models.ConstructionMaterial;
import com.remainder.models.ConstructionMaterialCategory;
import com.remainder.models.data.ConstructionMaterialCategoryDao;
import com.remainder.models.data.ConstructionMaterialDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

/**
 * Created by lisette on 10/8/17.
 */
@Controller
@RequestMapping("constructionMaterial")
public class ConstructionMaterialController {

    @Autowired
    private ConstructionMaterialDao constructionMaterialDao;

    @Autowired
    private ConstructionMaterialCategoryDao constructionMaterialCategoryDao;

    // index method gets the construction material posts and passes into the view
    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("constructionMaterials", constructionMaterialDao.findAll());
        model.addAttribute("title", "Construction Material Listings");

        return "constructionMaterial/index";
    }

    // below method displays the form only. Not using data.
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddConstructionMaterialListingForm(Model model) {

        model.addAttribute("title", "List Surplus Construction Materials");
        model.addAttribute(new ConstructionMaterial());
        model.addAttribute("constructionMaterialCategories", ConstructionMaterialCategory.values());
        return "constructionMaterial/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddConstructionMaterialListingForm(@ModelAttribute @Valid ConstructionMaterial newConstructionMaterial, Errors errors, @RequestParam int constructionMaterialCategoryId, Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "List available construction material");
            model.addAttribute("constructionMaterials", constructionMaterialCategoryDao.findAll());
            return "constructionMaterial/add";
        }
        ConstructionMaterialCategory cat = constructionMaterialCategoryDao.findOne(constructionMaterialCategoryId);
        newConstructionMaterial.setConstructionMaterialCategory(cat);
        constructionMaterialDao.save(newConstructionMaterial);

        //constructionMaterialDao.save(newConstructionMaterial);
        return "constructionMaterial/index";
    }
}
