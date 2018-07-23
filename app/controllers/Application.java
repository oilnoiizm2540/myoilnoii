package controllers;

import models.Collagen;
import play.*;
import play.api.templates.Html;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {
    public static Result main_page(Html content) {

        return ok(main_page.render(content));
    }

    public static Result index() {

        return main_page(home.render());
    }

    public static Result oder() {

        return main_page(oder.render());
    }

    public static Result promotion() {

        return main_page(promotion.render());
    }

    public static Result address() {

        return main_page(address.render());
    }

    public static Result product() {

        return main_page(product.render());
    }

    public static Result girl(){
        return main_page(girl.render());
    }

    public static Result home() {
        return main_page(home.render());
    }

    public static Result inputCollagen(){
        return main_page(inputCollagen.render());
    }

    public static Result dtp(){
        Collagen p1 = new Collagen("001", "IphoneX", "Appel", "2", 19800.00);
        Collagen p2 = new Collagen("002", "ปากกา", "hoyon", "2", 89.00);
        Collagen p3 = new Collagen("003", "Aiko", "Collagen", "3", 39.00);
        Collagen p4 = new Collagen("004", "แป้งพับ", "Collagen", "4", 390.00);
        Collagen p5 = new Collagen("005", "CL", "Collagen", "2", 450.00);
        Collagen p6 = new Collagen("006", "Collavit", "Collagen", "2", 300.00);

        return main_page(shop.render(p1, p2, p3, p4, p5, p6));
    }
}

