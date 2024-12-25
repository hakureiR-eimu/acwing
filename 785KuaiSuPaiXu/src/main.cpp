#include <iostream>
#include <vector>
using namespace std;
int Partition(vector<int> &A, int left, int right)
{
    int priot = A[left];
    while (left <= right)
    {
        while (A[right] >= priot)
            right--;
        A[left] = A[right];
        while (A[left] <= priot)
            left++;
        A[right] = A[left];
    }
    A[left] = priot;
    return left;
}
void QuickSort(vector<int> &A, int left, int right)
{
    if (left < right)
    {
        int pos = Partition(A, left, right);
        QuickSort(A, left, pos - 1);
        QuickSort(A, pos + 1, right);
    }
}
int main(int argc, char **argv)
{
    int n;
    scanf("%d", &n);
    vector<int> A(n);
    for (int i = 0; i < n; ++i)
    {
        scanf("%d", &A[i]);
    }
    QuickSort(A, 0, n - 1);
    for (int i = 0; i < n; ++i)
    {
        printf("%d ", A[i]);
    }
    // cout << "hello world!" << endl;
    return 0;
}
