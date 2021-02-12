import pandas as pd
import json
with open(r".//input//json_7.json", 'r') as f:
		data = json.load(f)
		if "city" in f.read():
 			print("city is present")
with open(r"./output_python/json_7.json", 'w') as f:
    entry = {"bidule":"chose"}
    data.update(entry)
    f.seek(0)
    f.write(str(data))