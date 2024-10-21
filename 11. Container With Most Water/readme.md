<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Container With Most Water</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
            background-color: #f9f9f9;
        }
        h2 {
            color: #2c3e50;
        }
        h3 {
            color: #16a085;
        }
        .problem-container {
            background-color: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            line-height: 1.6;
        }
        .example {
            background-color: #f0f8ff;
            border-left: 4px solid #007bff;
            padding: 10px;
            margin: 15px 0;
        }
        pre {
            background-color: #f8f8f8;
            padding: 10px;
            border-radius: 5px;
            overflow-x: auto;
        }
        ul {
            margin-top: 0;
        }
    </style>
</head>
<body>

    <div class="problem-container">
        <h2><a href="https://leetcode.com/problems/container-with-most-water/" target="_blank">Container With Most Water</a></h2>
        <h3>Medium</h3>
        <p>You are given an integer array <code>height</code> of length <code>n</code>. There are <code>n</code> vertical lines drawn such that the two endpoints of the <code>i-th</code> line are <code>(i, 0)</code> and <code>(i, height[i])</code>.</p>
        
        <p>Find two lines that together with the x-axis form a container, such that the container contains the most water.</p>
        
        <p>Return the maximum amount of water a container can store.</p>
        
        <p><strong>Note:</strong> You may not slant the container.</p>
        
        <div class="example">
            <p><strong>Example 1:</strong></p>
            <pre>
<strong>Input:</strong> height = [1,8,6,2,5,4,8,3,7]
<strong>Output:</strong> 49
<strong>Explanation:</strong> The above vertical lines are represented by the array [1,8,6,2,5,4,8,3,7]. 
In this case, the max area of water (blue section) the container can contain is 49.
            </pre>
        </div>
        
        <div class="example">
            <p><strong>Example 2:</strong></p>
            <pre>
<strong>Input:</strong> height = [1,1]
<strong>Output:</strong> 1
            </pre>
        </div>
        
        <p><strong>Constraints:</strong></p>
        <ul>
            <li><code>n == height.length</code></li>
            <li><code>2 &lt;= n &lt;= 10<sup>5</sup></code></li>
            <li><code>0 &lt;= height[i] &lt;= 10<sup>4</sup></code></li>
        </ul>
    </div>

</body>
</html>
