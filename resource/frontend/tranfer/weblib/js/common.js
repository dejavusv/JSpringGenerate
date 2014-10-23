function reloadAjax(targetId, callBackFunc ,action,servletName,servicesName,input,type)
{
    //setparameter
    
    var param = 'action='+action +
            '&servletName=' + servletName +
            '&servicesName=' + servicesName +
            '&data=' + input+ // additional parameter 
            '&type=' + type;
    CallAjax(param, targetId, null, callBackFunc,action);
    
}

function CallAjax(param, targetId, haveAll, forFastChange, action) {
    var url = 'AJAXServlet';
    try {
        $.ajax({
            type: "POST",
            url: url,
            cache: false,
            data: param,
            success: function(msg) {
                reloadData(msg, targetId, haveAll, forFastChange, action);
            }
        });
    } catch (e) {
        alert(e);
    }
}

function reloadData(response, targetId, haveAll, forFastChange, action) {
    var resxml = response;
    if (action == 'text') {
      var target = document.getElementById(targetId);
      target.value = response
    }else if (action == 'inner') {
      var target = document.getElementById(targetId);
      target.innerHTML = response
    }
    else {
        var objCombo = document.getElementById(targetId);
        var objComboLength = objCombo.options.length;
        //remove old value
        for (var i = 0; i < objComboLength; i++) {
            objCombo.remove(0);
        }

        var optionArr = resxml.getElementsByTagName('option');
        var optionArrLen = optionArr.length;

        if (null != haveAll)
        {
            var newOption = document.createElement("option");
            newOption.text = "ALL";
            newOption.value = "";
            objCombo.add(newOption);
        }
        //set new data
        for (var j = 0; j < optionArr.length; j++) {
            var optionLabel = optionArr[j].childNodes[0].childNodes[0].nodeValue;
            var optionValue = optionArr[j].childNodes[1].childNodes[0].nodeValue;
            var newOption = document.createElement("option");
            newOption.text = optionLabel;
            newOption.value = optionValue;
            objCombo.add(newOption);
        }

        var actionArr = resxml.getElementsByTagName('action');
        var actionArrLen = actionArr.length;
        if (actionArrLen > 0) {
            var actionType = actionArr[0].childNodes[0].nodeValue;
            if (actionType == "select")
            {
                selectData();
            }
        }
    }



    if (null != forFastChange)
    {
        eval(forFastChange);
    }
}

