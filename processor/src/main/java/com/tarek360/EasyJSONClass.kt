package com.tarek360

import javax.lang.model.element.TypeElement
import javax.lang.model.type.TypeMirror

internal class EasyJSONClass(val typeElement: TypeElement, val variableNames: List<String>) {
    val type: TypeMirror
        get() = typeElement.asType()
}
