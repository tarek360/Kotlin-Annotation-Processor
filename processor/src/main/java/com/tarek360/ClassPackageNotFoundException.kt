package com.tarek360

internal class ClassPackageNotFoundException(className: String)
    : Exception("The package of $className class has no name")
