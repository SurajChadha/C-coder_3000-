func greet(name: String) {
    print("========================")
    print("Happy Birthday \(name)")
    print("========================")
}

func bdayCake() {
    var style = [" ","🕯","⚪","⏹"]
    var cakeArray = [[0,0,0,0,0],[0,1,0,0,0,0,1,0],[2,2,2,2,2],[2,2,2,2,2],[3,3,3,3,3],[3,3,3,3,3]]
                    
    for cols in cakeArray {
        for rows in cols {
            print(style[rows],terminator: "")
        }
        print()
    }
}

greet(name:"Queen :)")
bdayCake()