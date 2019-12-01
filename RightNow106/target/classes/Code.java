import java.util.LinkedList;
import java.util.List;
import org.ainslec.picocog.PicoWriter;
import org.bson.Document;
import org.ainslec.picocog.PicoWriter;
import org.bson.RawBsonDocument;
import org.bson.conversions.Bson;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Projections;
public class Code implements DoStuff{
MongoDataBase db =MongoDataBase.getInstance();
public String doStuff(){
if(!db.is_user_achived_right("סיוע משפטי")){
try{if ( db.get_svar("var1").equals("כן"))
{
	db.getApp_user().add_right("סיוע משפטי");
}
}
catch(NumberFormatException e){}
try{if ( db.get_svar("var1").equals("לא") && db.get_svar("var2").equals("כן") && db.get_svar("var3").equals("כן"))
{
	db.getApp_user().add_right("סיוע משפטי");
}
}
catch(NumberFormatException e){}
try{if ( db.get_svar("var1").equals("לא") && ( db.get_svar("var2").equals("לא") && db.get_svar("var3").equals("לא") ) || ( db.get_svar("var2").equals("לא") && db.get_svar("var3").equals("כן") ) || ( db.get_svar("var2").equals("כן") && db.get_svar("var3").equals("לא") ) && db.get_svar("var8").equals("כן"))
{
	db.getApp_user().add_right("סיוע משפטי");
}
}
catch(NumberFormatException e){}
try{if ( db.get_svar("var1").equals("לא") && ( db.get_svar("var2").equals("לא") && db.get_svar("var3").equals("לא") ) || ( db.get_svar("var2").equals("לא") && db.get_svar("var3").equals("כן") ) || ( db.get_svar("var2").equals("כן") && db.get_svar("var3").equals("לא") ) && db.get_svar("var8").equals("לא") && db.get_svar("var4").equals("לא") && ( ( db.get_svar("var13").equals("רווק/אלמן/גרוש") "המתגורר" "עם" "הוריו" + db.get_ivar("var15") + ( db.get_svar("var16").equals("מתגורר") "עם" "הורה" "אחד" ) "-" 2 ) * ( "10,581" * "6%" ) + ( "10,581" * "67%)" > ( "סך_הכנסות" + db.get_ivar("var11") + db.get_ivar("var12") ) && db.get_svar("var17").equals("לא") && db.get_svar("var20").equals("לא") && db.get_svar("var23").equals("לא"))
{
	db.getApp_user().add_right("סיוע משפטי");
}
}
catch(NumberFormatException e){}

}String max_var = db.get_max_var();
Bson filter = new Document("id",db.getApp_user().getId());
		db.getApp_users().replaceOne(filter,db.getApp_user());
if(!max_var.equals("finish")){
return max_var.substring(3);
}
return max_var;
}

}
