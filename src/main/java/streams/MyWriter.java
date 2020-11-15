package streams;

import object.Person;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.*;

public class MyWriter {

    public void writeToTextFile(String filePath) throws IOException {
        Writer writer = new BufferedWriter(new FileWriter(filePath));

        StringBuffer outputText = new StringBuffer();
        outputText.append("Hello");
        outputText.append("\n");
        outputText.append("Dies ist ein Text");

        writer.write(outputText.toString());

        writer.close();
    }

    public void writeAtPosition(String filePath, int i) throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");

        file.seek(10);
        file.write("Hier schreiben".getBytes());

        file.close();
    }

    public void writeJson(String filePath) throws IOException {
        JSONObject obj = new JSONObject();
        obj.put("name", "Yanik");
        obj.put("age", 32);

        JSONArray list = new JSONArray();
        list.add("msg 1");
        list.add("msg 2");
        list.add("msg 3");

        obj.put("messages", list);

        Writer writer = new FileWriter(filePath);
        writer.write(obj.toJSONString());

        writer.close();
    }
    public void serializeObject(Person person, String filePath) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath));

        out.writeObject(person);

        out.close();
    }
}