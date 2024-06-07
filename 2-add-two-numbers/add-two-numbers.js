/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
function addTwoNumbers(l1, l2) {
    let dummy = new ListNode();
    let current = dummy;
    let carry = 0;

    while (l1 !== null || l2 !== null || carry !== 0) {
        let val1 = l1 !== null ? l1.val : 0;
        let val2 = l2 !== null ? l2.val : 0;

        // Calculate the sum and update carry
        let sumVal = val1 + val2 + carry;
        carry = Math.floor(sumVal / 10);
        sumVal = sumVal % 10;

        // Create a new node with the sumVal
        current.next = new ListNode(sumVal);
        current = current.next;

        // Move to the next nodes in l1 and l2
        if (l1 !== null) l1 = l1.next;
        if (l2 !== null) l2 = l2.next;
    }

    return dummy.next;
};