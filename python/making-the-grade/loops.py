"""
Loops
"""
import math


def round_scores(student_scores):
    """
    :param student_scores: list of student exam scores as float or int.
    :return: list of student scores *rounded* to nearest integer value.
    """
    new_list = []
    for i in student_scores:
        new_list.append(round(i))
    return new_list


def count_failed_students(student_scores):
    """
    :param student_scores: list of integer student scores.
    :return: integer count of student scores at or below 40.
    """
    students = 0
    for i in student_scores:
        if i <= 40:
            students += 1
    return students


def above_threshold(student_scores, threshold):
    """
    :param student_scores: list of integer scores
    :param threshold :  integer
    :return: list of integer scores that are at or above the "best" threshold.
    """
    new_list = []
    for i in student_scores:
        if i >= threshold:
            new_list.append(i)
    return new_list


def letter_grades(highest):
    """
    :param highest: integer of highest exam score.
    :return: list of integer score thresholds for each F-A letter grades.
    """
    lowest = 41
    difference = highest - lowest
    distribution = difference / 4
    new_list = []
    for i in range(4):
        new_list.append(math.ceil(lowest + (distribution * i)))
    return new_list


def student_ranking(student_scores, student_names):
    """
    :param student_scores: list of scores in descending order.
    :param student_names: list of names in descending order by exam score.
    :return: list of strings in format ["<rank>. <student name>: <score>"].
    """
    new_list = []

    for index, name in enumerate(student_names):
        new_list.append(f"{index + 1}. {name}: {student_scores[index]}")
    return new_list


def perfect_score(student_info):
    """
    :param student_info: list of [<student name>, <score>] lists
    :return: first `[<student name>, 100]` or `[]` if no student score of 100 is found.
    """
    for student in student_info:
        if student[1] == 100:
            return student
    return []
