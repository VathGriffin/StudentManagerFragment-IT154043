package com.example.studentmanagerfragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.studentmanagerfragment.models.StudentModel

class StudentViewModel : ViewModel() {
    val students = MutableLiveData<MutableList<StudentModel>>()

    init {
        students.value = mutableListOf(
            StudentModel("Nguyễn Văn A", "SV001"),
            StudentModel("Nguyễn Thị Hà", "SV002"),
            StudentModel("Trần Minh Li", "SV003"),
            StudentModel("Nguyen Quang Minh", "SV004"),
            StudentModel("Lê Thị Van", "SV005"),
            StudentModel("Đỗ Ánh Nguyệt", "SV006"),
            StudentModel("Vũ Đức Trưng", "SV007"),
        )
    }

    fun saveStudent(student: StudentModel, position: Int?) {
        val currentList = students.value ?: mutableListOf()

        if (position != null && position >= 0) {
            currentList[position] = student
        } else {
            currentList.add(student)
        }

        students.value = currentList
    }
}