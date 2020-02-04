<html>
    <body>
        <h3>Account Opening Form</h3>
        <hr>
        <form action="CreateAccount" method="post">
        <table>
            <tr>
                <td>Name</td><td><input type="text" name="name"/></td>
            </tr>
            <tr>
                <td>BDate</td><td><input type="date" name="bd"/></td>
            </tr>
            <tr>
                <td>City</td><td><select name="city">
                        <option>indore</option>
                        <option>bhopal</option>
                        <option>ujjain</option>
                    </select></td>
            </tr>
            <tr>
                <td>Fc.Rq.</td><td>  Locker  <input type="checkbox" name="fc" value="Locker"/>
                    ATM     <input type="checkbox" name="fc" value="ATM"/></td>
            </tr>
            <tr>
                <td>Ac Tp.</td><td>Saving  <input type="radio" name="atype" checked="checked" value="Saving"/>
                    Current <input type="radio" name="atype" value="Current"/></td>
            </tr>
            <tr>
                <td>Photo</td><td><input type="file" name="photo"/></td>
            </tr>
            <tr>
                <td><input type="submit"/></td>
                <td><input type="reset"</td>
        </tr>
            </table>
        </form>
        <hr>
        <a href="index.jsp">Home</a>
    </body>
</html>
