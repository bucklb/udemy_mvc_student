package udemy.spring.mvcTest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// BB : Flag that this is something that can act as a controller (and therefore have requests directed at it)
//      and allow specification of the root URL (so could distinguish between PSM and CM URLs that go to different controllers)
@RequestMapping("/student")
@Controller
public class StudentController {

    // enrollment type form ...
    @RequestMapping(value="/showForm")
    public String showStudentForm(ModelMap theModel){

        // Create new student and add it as attribute
        Student theStudent=new Student();
//        theStudent.setLastName("Doe");
        theModel.addAttribute("requestingStudent",theStudent);

        return "studentForm";
    }

    // Got the student details. Now what?
    @RequestMapping(value="/processForm")
    public String processStudentForm(@ModelAttribute("requestingStudent") Student theStudent, ModelMap model) {

        model.addAttribute("christianName",theStudent.getFirstName());
        model.addAttribute("surName",theStudent.getLastName());
        model.addAttribute("newStudent",theStudent);

        return "studentConfirm";
    }



    // BB : Initially we'll repond to EVERYTHING that's a GET with the the same "I heard you" style response.
    //      ?? Scope to allow summat else to handle a POST/PUT/DELETE etc ??
    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model){

        // BB : set an attribute (key/value) to be used in displaying the page/view that we tell the system to use
        //      so in this case use key=message, value=I heard ..., view= ...randomCrap...jsp
        model.addAttribute("message","Student stuff right this way ....");

        // BB : there could be MANY key pairs we set.  Definitely need not be just one!

        // BB : Looks like what we return is used to specify the page to be displayed next.
        //      ?? Returned value gets merged with prefix/suffix as defined in our context servlet (currently WEB-INF/mvcTest.xml)
        //      so likely to become /WEB-INF/view/<return value>.jsp
        return "randomCrap";
    }
}
