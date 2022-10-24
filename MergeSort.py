# complete code for merge sort along with merge function

def merge(array, left_index, right_index, middle, comparison_function):
    left_copy = array[left_index:middle + 1]
    right_copy = array[middle+1:right_index+1]

    left_copy_index = 0
    right_copy_index = 0
    sorted_index = left_index

    while left_copy_index < len(left_copy) and right_copy_index < len(right_copy):

        # use the comparison_function instead of a simple comparison operator
        if comparison_function(left_copy[left_copy_index], right_copy[right_copy_index]):
            array[sorted_index] = left_copy[left_copy_index]
            left_copy_index = left_copy_index + 1
        else:
            array[sorted_index] = right_copy[right_copy_index]
            right_copy_index = right_copy_index + 1

        sorted_index = sorted_index + 1

    while left_copy_index < len(left_copy):
        array[sorted_index] = left_copy[left_copy_index]
        left_copy_index = left_copy_index + 1
        sorted_index = sorted_index + 1

    while right_copy_index < len(right_copy):
        array[sorted_index] = right_copy[right_copy_index]
        right_copy_index = right_copy_index + 1
        sorted_index = sorted_index + 1


def merge_sort(array, left_index, right_index, comparison_function):
    if left_index >= right_index:
        return

    middle = (left_index + right_index)//2
    merge_sort(array, left_index, middle, comparison_function)
    merge_sort(array, middle + 1, right_index, comparison_function)
    merge(array, left_index, right_index, middle, comparison_function)
