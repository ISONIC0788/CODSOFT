# CODESOFT 
> Code.Create.Succed

## TASK 1 NUMBER GAME

1. Generate a random number within a specified range, such as 1 to 100.

2. Prompt the user to enter their guess for the generated number.

3. Compare the user's guess with the generated number and provide feedback on whether the guess
is correct, too high, or too low.

4. Repeat steps 2 and 3 until the user guesses the correct number
   
You can incorporate additional details as follows:

6. Limit the number of attempts the user has to guess the number.
7. Add the option for multiple rounds, allowing the user to play again.
8. Display the user's score, which can be based on the number of attempts taken or rounds won.

## TASK 2 STUDENT GRADE CALCULATOR

Input: Take marks obtained (out of 100) in each subject.
Calculate Total Marks: Sum up the marks obtained in all subjects.
Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
average percentage.
Grade Calculation: Assign grades based on the average percentage achieved.
Display Results: Show the total marks, average percentage, and the corresponding grade to the user
[GitHub]( https://github.com/ISONIC0788/CODSOFT.git )
## installation 
<div>
    <pre><code id="code-snippet">git clone [https://github.com/ISONIC0788/CODSOFT.git]</code></pre>
    <button onclick="copyToClipboard()">Copy</button>
</div>

<script>
function copyToClipboard() {
    var copyText = document.getElementById("code-snippet").textContent;
    navigator.clipboard.writeText(copyText).then(function() {
        alert('Copied to clipboard');
    }, function(err) {
        alert('Failed to copy text: ', err);
    });
}
</script>

