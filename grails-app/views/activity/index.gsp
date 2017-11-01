<!doctype html>
<html>
    <head>
        <meta name="layout" content="main"/>
        <title>Activity list</title>
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>Name</th>
                    <th>State</th>
                    <th></th>
                </tr>
            </thead>

            <tbody>
                <g:each in="${activityList}" var="activity">
                    <tr>
                        <td>${activity.name}</td>
                        <td>${activity.state}</td>
                        <td>
                            <g:link action="updateState" id="${activity.id}">Notify</g:link>
                        </td>
                    </tr>
                </g:each>
            </tbody>
        </table>
    </body>
</html>
