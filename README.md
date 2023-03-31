## StoryLang
The Story language is a domain-specific language for generating landscape descriptions inspired by the "landscape" option in the Tracery language. It allows users to create random landscape descriptions by providing words in six different categories: place, path, mood, substance, nearby, and move.

The **"place"** category is used to describe the setting of the landscape with a noun, such as the name of a city or the type of terrain.<br>
The **"path"** category is used to describe the paths or roads that run through the landscape with a noun, including any notable landmarks or points of interest along the way.<br>
The **"mood"** category is used to describe the overall feeling or atmosphere of the landscape with an adjective, such as peaceful, serene, or eerie. <br>
The **"substance"** category defines the physical elements of the landscape. It allows users to describe the features of the landscape, such as natural phenomena or physical elements.<br>
The **"nearby"** category is used to describe how far the landscape is from the point of view of the user. Example uses: 'far away', 'ahead', 'behind me'. <br>
The **"move"** category is used to describe the movement of things in the landscape with a verb, such as the flow of a river or the flight of birds.<br>
The **"amount"** category is used to choose how many randomly generated landscape descriptions should be created at once. It has to be an integer greater than 0.

With these categories of words, users can create unique and varied landscape descriptions in the Story language. By combining statements that use different categories of words, users can generate a wide range of landscapes with different settings, moods, and physical features. The Story language is a powerful tool for generating rich and evocative descriptions of imaginary landscapes.

## Example use
```
place: "forest";
move: "twirl", "curl", "dance", "twine", "weave", "meander", "wander", "flow";
substance: "light", "reflections", "mist", "shadow", "darkness", "brightness", "gaiety", "merriment";
mood: "overcast", "alight", "clear", "darkened", "blue", "shadowed", "illuminated", "silver", "cool", "warm", "summer-warmed";
nearby: "far away", "ahead", "behind me";
path: "stream", "brook", "path", "ravine", "forest", "fence", "stone wall";
amount: 10;
```

With this example, a set of 10 randomly generated landscape descriptions will be created based on words provided in every category. This is a sample output:
```
Ahead a clear forest twined through the shadowed stream, filling me with gaiety and gaiety.
Summer-warmed forest.
Far away a forest curled through the meandering forest, filling me with darkness and reflections.
Behind me a blue forest weaved through the path, filling me with gaiety.
Silver and cool, the forest was cool with gaiety and reflections.
Behind me a forest twirled through the flowing stone wall, filling me with mist and merriment.
Far away a warm forest twined through the dancing forest, filling me with light.
Behind me a cool forest weaved through the meandering stone wall, filling me with gaiety.
Behind me a clear forest weaved through the fence, filling me with brightness.
Ahead a forest weaved through the stone wall, filling me with darkness.
```
