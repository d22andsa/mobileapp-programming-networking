# Rapport

**
The point of this assignment was to fetch Json data from a URL that we then can specifically choose
what data that is to be displayed in the application.

public class Mountain {
private String ID;
private String name;
private String company;w
private String location;
private String category;
@SerializedName("cost")
private int feet;
@SerializedName("size")
private int meter;
Map<String,String> auxdata;

    public String getName() {
        return name;
    }

}
In this code snippet the class "mountain" is created that we then declare variables for each data points in the Json URL that together represent a mountain.
we then pick out what data we want to show in our application by creating a "get" method that returns the variable we want to use.


    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=brom";

    ArrayList<Mountain> listOfMountains;

    RecyclerView recyclerView;

Later in the MainActivity we declare the URL of where we want to pull the data from aswell as make an ArrayList of type Mountain where the data is stored,
and in the last row we declare our recycler view.

@Override
public void onPostExecute(String json) {
Log.d("MainActivity", json);
Gson gson = new Gson();

        Type type = new TypeToken<ArrayList<Mountain>>() {

        }.getType();
        listOfMountains = gson.fromJson(json, type);
        recyclerView = findViewById(R.id.recyclerView);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, listOfMountains, new RecyclerViewAdapter.OnClickListener() {
            @Override
            public void onClick(Mountain item) {
                Toast.makeText(MainActivity.this, item.getName(), Toast.LENGTH_SHORT).show();
            }
        });
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}
Here we first declare and initialize gson which we use to serialize the Json data into a java object that we put in our ArrayList.
We then declare and initialize an adapter. In the adapter we declare a onclick method that will show a text box from the top of the screen with the items name.
The adapter will then send the relevant data to a viewholder which contains the layout for each individual item in the arraylist and will show it in the application as displayed in the "app" screenshot.

**

