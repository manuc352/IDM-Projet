import pandas as pd
import json
with open(r".//input//json_8.json", 'r') as f:
		data = json.load(f)
		if "city" in f.read():
 			print("city is present")
with open(r"./output_python/json_8.json", 'w') as f:
    entry = {"bidule":"chose"}
    data.update(entry)
    f.seek(0)
    json.dump(data, f)