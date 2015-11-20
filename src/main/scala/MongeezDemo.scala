import com.mongodb.{MongoClient, Mongo}
import org.mongeez.{MongoAuth, Mongeez}
import org.springframework.core.io.ClassPathResource

object MongeezDemo extends App {

  val mongeez = new Mongeez();
  mongeez.setFile(new ClassPathResource("/mongeez.xml"));
  mongeez.setMongo(new MongoClient("localhost", 27017));
  mongeez.setDbName("profile");
  mongeez.setAuth(new MongoAuth("dyk","mongo"))
  mongeez.process();

}
