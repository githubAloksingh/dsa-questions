/**
 * @param {string} val
 * @return {Object}
 */
var expect = (val)=> {
    return {
        toBe:(val2)=>{
            if(val===val2) return true;
            else throw new Error("Not Equal");
        },
        
        notToBe:(val2)=>{
            if(val!==val2) return true;
            else throw new Error("Equal");
        }
        
        
    };
    
};



