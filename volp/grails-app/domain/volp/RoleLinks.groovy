package volp

class RoleLinks
{
    String controller_name
    String action_name
    String link_name
    int sort_order
    boolean isrolelinkactive
    static belongsTo=[role:Role]
    static constraints = {
    }
}
